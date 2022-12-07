(ns ogbe.fulcro.mui.icons.try-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TryOutlined" :default TryOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-try-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TryOutlined)))