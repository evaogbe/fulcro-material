(ns ogbe.fulcro.mui.icons.person-search-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PersonSearchOutlined" :default PersonSearchOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-search-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonSearchOutlined)))