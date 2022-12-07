(ns ogbe.fulcro.mui.icons.backspace-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BackspaceSharp" :default BackspaceSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backspace-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BackspaceSharp)))