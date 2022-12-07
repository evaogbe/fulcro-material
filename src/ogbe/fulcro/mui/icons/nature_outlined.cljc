(ns ogbe.fulcro.mui.icons.nature-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NatureOutlined" :default NatureOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nature-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NatureOutlined)))