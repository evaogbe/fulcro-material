(ns ogbe.fulcro.mui.icons.person-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PersonOutlined" :default PersonOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonOutlined)))