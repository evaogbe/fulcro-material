(ns ogbe.fulcro.mui.icons.church
  #?(:cljs (:require
            ["@mui/icons-material/Church" :default Church]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-church
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Church)))