(ns ogbe.fulcro.mui.icons.dry-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DryOutlined" :default DryOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dry-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DryOutlined)))