(ns ogbe.fulcro.mui.icons.view-list-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ViewListOutlined" :default ViewListOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-list-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewListOutlined)))