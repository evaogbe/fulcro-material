(ns ogbe.fulcro.mui.icons.coronavirus-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CoronavirusRounded" :default CoronavirusRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-coronavirus-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CoronavirusRounded)))