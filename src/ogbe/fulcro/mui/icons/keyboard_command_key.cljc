(ns ogbe.fulcro.mui.icons.keyboard-command-key
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardCommandKey" :default KeyboardCommandKey]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-command-key
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardCommandKey)))