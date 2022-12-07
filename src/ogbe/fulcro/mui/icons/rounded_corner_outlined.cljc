(ns ogbe.fulcro.mui.icons.rounded-corner-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RoundedCornerOutlined" :default RoundedCornerOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rounded-corner-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RoundedCornerOutlined)))