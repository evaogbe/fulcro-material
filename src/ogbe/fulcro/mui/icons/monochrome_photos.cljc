(ns ogbe.fulcro.mui.icons.monochrome-photos
  #?(:cljs (:require
            ["@mui/icons-material/MonochromePhotos" :default MonochromePhotos]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-monochrome-photos
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MonochromePhotos)))