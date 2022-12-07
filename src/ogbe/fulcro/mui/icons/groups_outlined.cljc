(ns ogbe.fulcro.mui.icons.groups-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GroupsOutlined" :default GroupsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-groups-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GroupsOutlined)))