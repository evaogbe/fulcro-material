(ns ogbe.fulcro.mui.icons.gif-box-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GifBoxSharp" :default GifBoxSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gif-box-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GifBoxSharp)))