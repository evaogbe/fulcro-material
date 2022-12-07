(ns ogbe.fulcro.mui.icons.gif-box-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GifBoxRounded" :default GifBoxRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gif-box-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GifBoxRounded)))