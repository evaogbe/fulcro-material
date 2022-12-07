(ns ogbe.fulcro.mui.icons.mms-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MmsOutlined" :default MmsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mms-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MmsOutlined)))