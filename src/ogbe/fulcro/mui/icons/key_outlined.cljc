(ns ogbe.fulcro.mui.icons.key-outlined
  #?(:cljs (:require
            ["@mui/icons-material/KeyOutlined" :default KeyOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-key-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyOutlined)))