(ns ogbe.fulcro.mui.icons.people-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PeopleOutlined" :default PeopleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-people-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PeopleOutlined)))