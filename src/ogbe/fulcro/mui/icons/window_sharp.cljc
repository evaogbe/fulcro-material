(ns ogbe.fulcro.mui.icons.window-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WindowSharp" :default WindowSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-window-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WindowSharp)))