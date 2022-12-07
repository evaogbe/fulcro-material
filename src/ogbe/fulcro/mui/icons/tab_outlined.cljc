(ns ogbe.fulcro.mui.icons.tab-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TabOutlined" :default TabOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tab-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabOutlined)))