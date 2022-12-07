(ns ogbe.fulcro.mui.icons.school-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SchoolOutlined" :default SchoolOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-school-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SchoolOutlined)))