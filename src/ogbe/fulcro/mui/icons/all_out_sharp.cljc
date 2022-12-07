(ns ogbe.fulcro.mui.icons.all-out-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AllOutSharp" :default AllOutSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-all-out-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AllOutSharp)))