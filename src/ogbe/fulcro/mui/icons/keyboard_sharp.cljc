(ns ogbe.fulcro.mui.icons.keyboard-sharp
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardSharp" :default KeyboardSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardSharp)))