(ns ogbe.fulcro.mui.icons.hub-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HubSharp" :default HubSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hub-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HubSharp)))