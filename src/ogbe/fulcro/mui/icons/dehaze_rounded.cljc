(ns ogbe.fulcro.mui.icons.dehaze-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DehazeRounded" :default DehazeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dehaze-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DehazeRounded)))