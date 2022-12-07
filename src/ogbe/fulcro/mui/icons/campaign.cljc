(ns ogbe.fulcro.mui.icons.campaign
  #?(:cljs (:require
            ["@mui/icons-material/Campaign" :default Campaign]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-campaign
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Campaign)))