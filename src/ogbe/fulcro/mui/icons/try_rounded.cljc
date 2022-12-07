(ns ogbe.fulcro.mui.icons.try-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TryRounded" :default TryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-try-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TryRounded)))