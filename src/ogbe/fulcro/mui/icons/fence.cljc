(ns ogbe.fulcro.mui.icons.fence
  #?(:cljs (:require
            ["@mui/icons-material/Fence" :default Fence]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fence
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Fence)))