(ns ogbe.fulcro.mui.icons.facebook-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FacebookOutlined" :default FacebookOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-facebook-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FacebookOutlined)))