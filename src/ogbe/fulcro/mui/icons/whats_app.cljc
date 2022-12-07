(ns ogbe.fulcro.mui.icons.whats-app
  #?(:cljs (:require
            ["@mui/icons-material/WhatsApp" :default WhatsApp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-whats-app
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WhatsApp)))