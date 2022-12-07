(ns ogbe.fulcro.mui.icons.keyboard-tab
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardTab" :default KeyboardTab]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-tab
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardTab)))