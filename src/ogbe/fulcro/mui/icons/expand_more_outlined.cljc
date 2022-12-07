(ns ogbe.fulcro.mui.icons.expand-more-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ExpandMoreOutlined" :default ExpandMoreOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-expand-more-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExpandMoreOutlined)))