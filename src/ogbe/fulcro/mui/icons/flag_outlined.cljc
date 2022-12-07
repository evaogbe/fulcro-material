(ns ogbe.fulcro.mui.icons.flag-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FlagOutlined" :default FlagOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flag-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlagOutlined)))