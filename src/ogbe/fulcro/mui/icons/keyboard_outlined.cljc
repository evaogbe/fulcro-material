(ns ogbe.fulcro.mui.icons.keyboard-outlined
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardOutlined" :default KeyboardOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardOutlined)))