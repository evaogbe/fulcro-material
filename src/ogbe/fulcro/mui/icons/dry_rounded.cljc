(ns ogbe.fulcro.mui.icons.dry-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DryRounded" :default DryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dry-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DryRounded)))