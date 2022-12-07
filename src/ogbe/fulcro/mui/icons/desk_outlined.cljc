(ns ogbe.fulcro.mui.icons.desk-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DeskOutlined" :default DeskOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-desk-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeskOutlined)))