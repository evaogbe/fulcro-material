(ns ogbe.fulcro.mui.icons.flaky-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FlakyOutlined" :default FlakyOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flaky-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlakyOutlined)))