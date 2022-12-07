(ns ogbe.fulcro.mui.icons.gif-box
  #?(:cljs (:require
            ["@mui/icons-material/GifBox" :default GifBox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gif-box
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GifBox)))