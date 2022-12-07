(ns ogbe.fulcro.mui.icons.public-off
  #?(:cljs (:require
            ["@mui/icons-material/PublicOff" :default PublicOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-public-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PublicOff)))