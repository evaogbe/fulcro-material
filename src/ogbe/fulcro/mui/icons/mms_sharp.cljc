(ns ogbe.fulcro.mui.icons.mms-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MmsSharp" :default MmsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mms-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MmsSharp)))