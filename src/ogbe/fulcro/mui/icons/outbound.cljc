(ns ogbe.fulcro.mui.icons.outbound
  #?(:cljs (:require
            ["@mui/icons-material/Outbound" :default Outbound]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbound
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Outbound)))