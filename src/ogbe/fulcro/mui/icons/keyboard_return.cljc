(ns ogbe.fulcro.mui.icons.keyboard-return
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardReturn" :default KeyboardReturn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-return
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardReturn)))