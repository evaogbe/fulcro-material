(ns ogbe.fulcro.mui.icons.open-in-full-rounded
  #?(:cljs (:require
            ["@mui/icons-material/OpenInFullRounded" :default OpenInFullRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-in-full-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenInFullRounded)))