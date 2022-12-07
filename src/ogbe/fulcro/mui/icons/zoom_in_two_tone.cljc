(ns ogbe.fulcro.mui.icons.zoom-in-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ZoomInTwoTone" :default ZoomInTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-in-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomInTwoTone)))