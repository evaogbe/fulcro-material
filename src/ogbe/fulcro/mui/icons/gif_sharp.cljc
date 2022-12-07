(ns ogbe.fulcro.mui.icons.gif-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GifSharp" :default GifSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gif-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GifSharp)))