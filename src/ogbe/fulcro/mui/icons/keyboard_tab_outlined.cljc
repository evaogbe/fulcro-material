(ns ogbe.fulcro.mui.icons.keyboard-tab-outlined
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardTabOutlined" :default KeyboardTabOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-tab-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardTabOutlined)))