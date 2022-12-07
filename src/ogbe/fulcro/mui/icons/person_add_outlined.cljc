(ns ogbe.fulcro.mui.icons.person-add-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PersonAddOutlined" :default PersonAddOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-add-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonAddOutlined)))