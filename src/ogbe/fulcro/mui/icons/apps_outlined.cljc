(ns ogbe.fulcro.mui.icons.apps-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AppsOutlined" :default AppsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-apps-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppsOutlined)))