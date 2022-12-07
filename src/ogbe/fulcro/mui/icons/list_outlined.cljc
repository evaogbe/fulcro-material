(ns ogbe.fulcro.mui.icons.list-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ListOutlined" :default ListOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-list-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ListOutlined)))