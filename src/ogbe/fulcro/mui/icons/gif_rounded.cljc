(ns ogbe.fulcro.mui.icons.gif-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GifRounded" :default GifRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gif-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GifRounded)))