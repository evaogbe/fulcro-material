(ns ogbe.fulcro.mui.icons.gif-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/GifTwoTone" :default GifTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gif-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GifTwoTone)))