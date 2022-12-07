(ns ogbe.fulcro.mui.icons.php-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PhpSharp" :default PhpSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-php-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhpSharp)))