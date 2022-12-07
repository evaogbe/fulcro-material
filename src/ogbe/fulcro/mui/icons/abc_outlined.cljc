(ns ogbe.fulcro.mui.icons.abc-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AbcOutlined" :default AbcOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-abc-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AbcOutlined)))