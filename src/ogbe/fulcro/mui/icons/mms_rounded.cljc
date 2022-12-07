(ns ogbe.fulcro.mui.icons.mms-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MmsRounded" :default MmsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mms-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MmsRounded)))