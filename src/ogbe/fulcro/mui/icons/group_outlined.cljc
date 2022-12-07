(ns ogbe.fulcro.mui.icons.group-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GroupOutlined" :default GroupOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-group-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GroupOutlined)))